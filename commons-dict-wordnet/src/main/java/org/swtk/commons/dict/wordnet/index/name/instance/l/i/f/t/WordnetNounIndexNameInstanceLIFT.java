package org.swtk.commons.dict.wordnet.index.name.instance.l.i.f.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIFT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lift\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"00117196\", \"00310102\", \"00317420\", \"00675401\", \"03286056\", \"03669700\", \"03669840\", \"04238755\", \"07362999\", \"07385271\", \"11442391\", \"01211977\"]}");
	add("{\"term\":\"lifter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09886067\", \"10793062\"]}");
	add("{\"term\":\"liftgate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03503787\"]}");
	add("{\"term\":\"liftman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10070069\"]}");
	add("{\"term\":\"liftoff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07385768\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }