package org.swtk.commons.dict.wordnet.indexbyname.instance.s.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sedalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09130572\"]}");
	add("{\"term\":\"sedan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04173497\", \"04173342\"]}");
	add("{\"term\":\"sedateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04655183\"]}");
	add("{\"term\":\"sedation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00696553\", \"14313714\"]}");
	add("{\"term\":\"sedative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04173614\"]}");
	add("{\"term\":\"seder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01037699\"]}");
	add("{\"term\":\"sedge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12170545\"]}");
	add("{\"term\":\"sediment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09451871\"]}");
	add("{\"term\":\"sedimentation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11465491\"]}");
	add("{\"term\":\"sedition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00774302\"]}");
	add("{\"term\":\"sedna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09452098\"]}");
	add("{\"term\":\"seducer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10594533\", \"10594685\"]}");
	add("{\"term\":\"seduction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00161352\", \"00161235\"]}");
	add("{\"term\":\"seductress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10594831\"]}");
	add("{\"term\":\"sedulity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04873309\"]}");
	add("{\"term\":\"sedulousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04873309\"]}");
	add("{\"term\":\"sedum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12806484\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }