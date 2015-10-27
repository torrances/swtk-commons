package org.swtk.commons.dict.wordnet.index.name.instance.a.l.k.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALKA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alkahest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15073030\"]}");
	add("{\"term\":\"alkalemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044407\"]}");
	add("{\"term\":\"alkali\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14736197\", \"14642431\"]}");
	add("{\"term\":\"alkalimetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00649330\"]}");
	add("{\"term\":\"alkalinity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05046863\"]}");
	add("{\"term\":\"alkalinuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044589\"]}");
	add("{\"term\":\"alkaliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14802178\"]}");
	add("{\"term\":\"alkalizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14802178\"]}");
	add("{\"term\":\"alkaloid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14736853\"]}");
	add("{\"term\":\"alkalosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044737\"]}");
	add("{\"term\":\"alkaluria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14044589\"]}");
	add("{\"term\":\"alkane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14975516\"]}");
	add("{\"term\":\"alkanet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12838454\"]}");
	add("{\"term\":\"alkapton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14609228\"]}");
	add("{\"term\":\"alkaptonuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14108191\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }