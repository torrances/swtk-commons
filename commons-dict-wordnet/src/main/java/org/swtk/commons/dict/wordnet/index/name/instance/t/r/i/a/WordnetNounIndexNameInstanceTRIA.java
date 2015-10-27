package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"triacetate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14989496\"]}");
	add("{\"term\":\"triad\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06883261\", \"08002508\", \"08002640\", \"13766184\"]}");
	add("{\"term\":\"triaenodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01495653\"]}");
	add("{\"term\":\"triage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01019109\"]}");
	add("{\"term\":\"triakidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01494632\"]}");
	add("{\"term\":\"trial\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"07387559\", \"07492371\", \"01198357\", \"00796028\", \"05807220\", \"00792739\"]}");
	add("{\"term\":\"trialeurodes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02249728\"]}");
	add("{\"term\":\"triamcinolone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15103335\"]}");
	add("{\"term\":\"triangle\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04488109\", \"04488251\", \"09484854\", \"13902291\", \"13901977\"]}");
	add("{\"term\":\"triangularity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05079692\"]}");
	add("{\"term\":\"triangulation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00618577\", \"06017497\"]}");
	add("{\"term\":\"triangulum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09484854\"]}");
	add("{\"term\":\"triassic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15151702\"]}");
	add("{\"term\":\"triatoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02247048\"]}");
	add("{\"term\":\"triavil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03924419\"]}");
	add("{\"term\":\"triazine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15103597\"]}");
	add("{\"term\":\"triazolam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04487881\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }