package org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10769021\", \"10769383\"]}");
	add("{\"term\":\"vetch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12595827\"]}");
	add("{\"term\":\"vetchling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12559579\"]}");
	add("{\"term\":\"vetchworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02312986\"]}");
	add("{\"term\":\"veteran\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10768791\", \"10769021\", \"10769196\"]}");
	add("{\"term\":\"veteran soldier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10769196\"]}");
	add("{\"term\":\"veterans day\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15225731\"]}");
	add("{\"term\":\"veterans of foreign wars\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08246055\"]}");
	add("{\"term\":\"veterinarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10769383\"]}");
	add("{\"term\":\"veterinary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10769383\"]}");
	add("{\"term\":\"veterinary medicine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06074973\"]}");
	add("{\"term\":\"veterinary school\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08304256\"]}");
	add("{\"term\":\"veterinary surgeon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10769383\"]}");
	add("{\"term\":\"vetluga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09494611\"]}");
	add("{\"term\":\"vetluga river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09494611\"]}");
	add("{\"term\":\"veto\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05206196\", \"00210395\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }