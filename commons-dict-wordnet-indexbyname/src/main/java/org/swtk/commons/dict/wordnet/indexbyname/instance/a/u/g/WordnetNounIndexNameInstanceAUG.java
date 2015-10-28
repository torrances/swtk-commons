package org.swtk.commons.dict.wordnet.indexbyname.instance.a.u.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAUG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15237251\"]}");
	add("{\"term\":\"augeas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09509554\"]}");
	add("{\"term\":\"augend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13751034\"]}");
	add("{\"term\":\"auger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02761495\", \"03975218\"]}");
	add("{\"term\":\"aught\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13762308\"]}");
	add("{\"term\":\"augite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14691829\"]}");
	add("{\"term\":\"augmentation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00366057\", \"07043863\", \"07384070\"]}");
	add("{\"term\":\"augmentin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02706753\"]}");
	add("{\"term\":\"augur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09842689\"]}");
	add("{\"term\":\"augury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07300719\"]}");
	add("{\"term\":\"august\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15237251\"]}");
	add("{\"term\":\"augusta\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09099622\", \"09115400\"]}");
	add("{\"term\":\"augustine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10848177\"]}");
	add("{\"term\":\"augustinian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10798379\"]}");
	add("{\"term\":\"augustus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10848594\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }