package org.swtk.commons.dict.wordnet.index.name.instance.p.a.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePACH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pacha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10423513\"]}");
	add("{\"term\":\"pachinko\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00460489\"]}");
	add("{\"term\":\"pachisi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00506457\"]}");
	add("{\"term\":\"pachouli\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03903968\", \"12883588\"]}");
	add("{\"term\":\"pachuco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10409749\"]}");
	add("{\"term\":\"pachycephala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01559009\"]}");
	add("{\"term\":\"pachycephalosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01705802\"]}");
	add("{\"term\":\"pachycephalosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01705802\"]}");
	add("{\"term\":\"pachycheilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14533093\"]}");
	add("{\"term\":\"pachyderm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02455739\"]}");
	add("{\"term\":\"pachyderma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14391202\"]}");
	add("{\"term\":\"pachyrhizus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12575574\"]}");
	add("{\"term\":\"pachysandra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12767644\"]}");
	add("{\"term\":\"pachytene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13552521\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }