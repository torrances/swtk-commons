package org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cicada\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02259308\"]}");
	add("{\"term\":\"cicadellidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02261432\"]}");
	add("{\"term\":\"cicadidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02259017\"]}");
	add("{\"term\":\"cicala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02259308\"]}");
	add("{\"term\":\"cicatrice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14386888\"]}");
	add("{\"term\":\"cicatrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14386888\"]}");
	add("{\"term\":\"cicer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12536102\"]}");
	add("{\"term\":\"cicero\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10917698\", \"13734995\"]}");
	add("{\"term\":\"cicerone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09942461\"]}");
	add("{\"term\":\"cichlid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02588503\"]}");
	add("{\"term\":\"cichlidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02588363\"]}");
	add("{\"term\":\"cichorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11973369\"]}");
	add("{\"term\":\"cicindelidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02167625\"]}");
	add("{\"term\":\"ciconia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02005038\"]}");
	add("{\"term\":\"ciconiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02004475\"]}");
	add("{\"term\":\"ciconiiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02004082\"]}");
	add("{\"term\":\"cicuta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12955536\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }