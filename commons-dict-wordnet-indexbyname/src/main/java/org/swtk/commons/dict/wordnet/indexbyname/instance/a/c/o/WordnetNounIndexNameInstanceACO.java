package org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceACO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"acocanthera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11788711\"]}");
	add("{\"term\":\"acokanthera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11788711\"]}");
	add("{\"term\":\"acolyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09782772\"]}");
	add("{\"term\":\"aconcagua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09210101\"]}");
	add("{\"term\":\"aconite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11743451\"]}");
	add("{\"term\":\"aconitum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11743238\"]}");
	add("{\"term\":\"acoraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11801216\"]}");
	add("{\"term\":\"acorea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14045324\"]}");
	add("{\"term\":\"acores\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09007715\"]}");
	add("{\"term\":\"acorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12288194\"]}");
	add("{\"term\":\"acorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11801058\"]}");
	add("{\"term\":\"acousma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14401235\"]}");
	add("{\"term\":\"acoustic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02678841\"]}");
	add("{\"term\":\"acoustician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09783091\"]}");
	add("{\"term\":\"acousticophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14407632\"]}");
	add("{\"term\":\"acoustics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06104381\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }