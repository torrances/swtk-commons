package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"need\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"14517300\", \"00023953\", \"09390888\", \"14472592\"]}");
	add("{\"term\":\"needer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10785693\"]}");
	add("{\"term\":\"neediness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04727081\", \"14517010\"]}");
	add("{\"term\":\"needle\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03930040\", \"03821676\", \"03821934\", \"13178493\"]}");
	add("{\"term\":\"needlebush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12239806\"]}");
	add("{\"term\":\"needlecraft\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00911768\", \"03822389\"]}");
	add("{\"term\":\"needlefish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01458419\", \"02552620\"]}");
	add("{\"term\":\"needlepoint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03822199\", \"03982146\"]}");
	add("{\"term\":\"needlewoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10053137\"]}");
	add("{\"term\":\"needlewood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12239582\"]}");
	add("{\"term\":\"needlework\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00911768\", \"03822389\"]}");
	add("{\"term\":\"needleworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10371012\"]}");
	add("{\"term\":\"needy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08486689\"]}");
	add("{\"term\":\"neel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11222571\"]}");
	add("{\"term\":\"neem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12717253\"]}");
	add("{\"term\":\"neencephalon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05489201\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }