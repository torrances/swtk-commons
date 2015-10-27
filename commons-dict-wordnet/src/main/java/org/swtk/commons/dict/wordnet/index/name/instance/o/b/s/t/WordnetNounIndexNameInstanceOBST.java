package org.swtk.commons.dict.wordnet.index.name.instance.o.b.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOBST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"obstacle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03845315\", \"05698074\"]}");
	add("{\"term\":\"obstetrician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10389398\"]}");
	add("{\"term\":\"obstetrics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06062970\"]}");
	add("{\"term\":\"obstinacy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04870305\", \"04916012\"]}");
	add("{\"term\":\"obstinance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04870305\", \"04916012\"]}");
	add("{\"term\":\"obstipation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14395175\"]}");
	add("{\"term\":\"obstreperousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04915460\"]}");
	add("{\"term\":\"obstructer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03845513\", \"10368974\"]}");
	add("{\"term\":\"obstruction\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00563317\", \"01076422\", \"05698074\", \"14531553\", \"03845513\"]}");
	add("{\"term\":\"obstructionism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01179421\"]}");
	add("{\"term\":\"obstructionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10368974\"]}");
	add("{\"term\":\"obstructor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03845513\", \"10368974\"]}");
	add("{\"term\":\"obstruent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07130392\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }