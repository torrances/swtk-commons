package org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAEO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aeolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08801956\"]}");
	add("{\"term\":\"aeolian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08177596\", \"09730149\"]}");
	add("{\"term\":\"aeolian harp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02685261\"]}");
	add("{\"term\":\"aeolian lyre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02685261\"]}");
	add("{\"term\":\"aeolic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06990460\"]}");
	add("{\"term\":\"aeolic dialect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06990460\"]}");
	add("{\"term\":\"aeolis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08801956\"]}");
	add("{\"term\":\"aeolus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09576619\"]}");
	add("{\"term\":\"aeon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15268401\", \"15268541\", \"09559695\"]}");
	add("{\"term\":\"aeonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12807444\"]}");
	add("{\"term\":\"aeonium haworthii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12807596\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }