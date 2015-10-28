package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gob\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05309806\", \"07977884\", \"10314263\"]}");
	add("{\"term\":\"gobbet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07666854\"]}");
	add("{\"term\":\"gobble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07398727\"]}");
	add("{\"term\":\"gobbledygook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07084361\"]}");
	add("{\"term\":\"gobbler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01796985\", \"10153802\"]}");
	add("{\"term\":\"gobi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09192698\"]}");
	add("{\"term\":\"gobiesocidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02637940\"]}");
	add("{\"term\":\"gobiesox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02638089\"]}");
	add("{\"term\":\"gobiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02621659\"]}");
	add("{\"term\":\"gobio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01445767\"]}");
	add("{\"term\":\"goblet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03006552\", \"03448295\"]}");
	add("{\"term\":\"goblin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09566877\"]}");
	add("{\"term\":\"gobs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13799721\"]}");
	add("{\"term\":\"goby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02621795\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }