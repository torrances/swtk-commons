package org.swtk.commons.dict.wordnet.index.name.instance.s.t.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stapedectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00689110\"]}");
	add("{\"term\":\"stapelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13259273\"]}");
	add("{\"term\":\"stapes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05334013\"]}");
	add("{\"term\":\"staph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01382030\"]}");
	add("{\"term\":\"staphylaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12790190\"]}");
	add("{\"term\":\"staphylea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12790423\"]}");
	add("{\"term\":\"staphylinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02183394\"]}");
	add("{\"term\":\"staphylococci\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01382030\"]}");
	add("{\"term\":\"staphylococcus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01382030\"]}");
	add("{\"term\":\"staple\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04310233\", \"04310396\", \"14620880\", \"15043255\", \"02803952\"]}");
	add("{\"term\":\"staplegun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04310495\"]}");
	add("{\"term\":\"stapler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04310635\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }