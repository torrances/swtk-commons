package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alkahest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15073030\"]}");
	add("{\"term\":\"alkalemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044407\"]}");
	add("{\"term\":\"alkali\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14736197\", \"14642431\"]}");
	add("{\"term\":\"alkali bee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02213573\"]}");
	add("{\"term\":\"alkali grass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12487523\"]}");
	add("{\"term\":\"alkali metal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14736385\"]}");
	add("{\"term\":\"alkali poisoning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14533706\"]}");
	add("{\"term\":\"alkalimetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00649330\"]}");
	add("{\"term\":\"alkaline earth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14736650\"]}");
	add("{\"term\":\"alkaline metal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14736385\"]}");
	add("{\"term\":\"alkalinity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05046863\"]}");
	add("{\"term\":\"alkalinuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044589\"]}");
	add("{\"term\":\"alkaliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14802178\"]}");
	add("{\"term\":\"alkalizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14802178\"]}");
	add("{\"term\":\"alkaloid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14736853\"]}");
	add("{\"term\":\"alkalosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044737\"]}");
	add("{\"term\":\"alkaluria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044589\"]}");
	add("{\"term\":\"alkane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14975516\"]}");
	add("{\"term\":\"alkane series\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14975516\"]}");
	add("{\"term\":\"alkanet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12838454\"]}");
	add("{\"term\":\"alkapton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14609228\"]}");
	add("{\"term\":\"alkaptonuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14108191\"]}");
	add("{\"term\":\"alkene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14737281\"]}");
	add("{\"term\":\"alkeran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03749068\"]}");
	add("{\"term\":\"alky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09801608\"]}");
	add("{\"term\":\"alkyd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14926651\"]}");
	add("{\"term\":\"alkyd resin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14926651\"]}");
	add("{\"term\":\"alkyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14641367\"]}");
	add("{\"term\":\"alkyl group\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14641367\"]}");
	add("{\"term\":\"alkyl halide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14625824\"]}");
	add("{\"term\":\"alkyl radical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14641367\"]}");
	add("{\"term\":\"alkylating agent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02700297\"]}");
	add("{\"term\":\"alkylbenzene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14625683\"]}");
	add("{\"term\":\"alkylbenzenesulfonate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14737408\"]}");
	add("{\"term\":\"alkyne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14624920\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }