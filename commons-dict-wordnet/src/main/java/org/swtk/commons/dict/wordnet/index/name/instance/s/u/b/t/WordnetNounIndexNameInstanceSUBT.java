package org.swtk.commons.dict.wordnet.index.name.instance.s.u.b.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUBT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"subterfuge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06773219\"]}");
	add("{\"term\":\"subthalamus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05506695\"]}");
	add("{\"term\":\"subtilin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04355932\"]}");
	add("{\"term\":\"subtitle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06358407\", \"06358958\"]}");
	add("{\"term\":\"subtlety\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04718532\", \"06618544\"]}");
	add("{\"term\":\"subtonic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06871589\"]}");
	add("{\"term\":\"subtopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08557456\"]}");
	add("{\"term\":\"subtotal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05869559\"]}");
	add("{\"term\":\"subtracter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04356066\", \"10690739\"]}");
	add("{\"term\":\"subtraction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00361583\", \"00873540\"]}");
	add("{\"term\":\"subtrahend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13751245\"]}");
	add("{\"term\":\"subtreasury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13379433\"]}");
	add("{\"term\":\"subtropics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08692082\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }