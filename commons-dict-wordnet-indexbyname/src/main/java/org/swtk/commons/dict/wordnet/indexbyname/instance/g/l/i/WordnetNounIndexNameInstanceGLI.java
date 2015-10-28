package org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05474706\"]}");
	add("{\"term\":\"glibness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05102586\"]}");
	add("{\"term\":\"glide\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00304321\", \"00329328\", \"07129117\"]}");
	add("{\"term\":\"glider\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03444738\"]}");
	add("{\"term\":\"gliding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00304321\"]}");
	add("{\"term\":\"glimmer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05924900\", \"07427078\"]}");
	add("{\"term\":\"glimmering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05924900\"]}");
	add("{\"term\":\"glimpse\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06815302\", \"05943132\", \"00879303\"]}");
	add("{\"term\":\"glinka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11022418\"]}");
	add("{\"term\":\"glint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04960473\", \"07426910\"]}");
	add("{\"term\":\"glioblastoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14260354\"]}");
	add("{\"term\":\"glioma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14260514\"]}");
	add("{\"term\":\"glipizide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03444948\"]}");
	add("{\"term\":\"gliricidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12552232\"]}");
	add("{\"term\":\"gliridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02355042\"]}");
	add("{\"term\":\"glis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02355456\"]}");
	add("{\"term\":\"glissade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00535381\"]}");
	add("{\"term\":\"glissando\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06870172\"]}");
	add("{\"term\":\"glisten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04960121\"]}");
	add("{\"term\":\"glister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04960121\"]}");
	add("{\"term\":\"glitch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14488259\"]}");
	add("{\"term\":\"glitter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07427268\", \"04960121\"]}");
	add("{\"term\":\"glitz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04825931\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }