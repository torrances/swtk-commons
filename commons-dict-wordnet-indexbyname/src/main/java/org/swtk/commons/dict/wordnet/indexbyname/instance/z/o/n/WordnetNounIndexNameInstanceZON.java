package org.swtk.commons.dict.wordnet.indexbyname.instance.z.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05618817\"]}");
	add("{\"term\":\"zona pellucida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05616370\"]}");
	add("{\"term\":\"zonal pelargonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12708459\"]}");
	add("{\"term\":\"zone\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05618817\", \"08526463\", \"08559404\", \"08705985\"]}");
	add("{\"term\":\"zone fire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00997075\"]}");
	add("{\"term\":\"zone of interior\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08569559\"]}");
	add("{\"term\":\"zoning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00930566\"]}");
	add("{\"term\":\"zoning board\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08430486\"]}");
	add("{\"term\":\"zoning commission\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08430638\"]}");
	add("{\"term\":\"zonotrichia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01537951\"]}");
	add("{\"term\":\"zonotrichia albicollis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01538110\"]}");
	add("{\"term\":\"zonotrichia leucophrys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01538331\"]}");
	add("{\"term\":\"zonula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05618976\"]}");
	add("{\"term\":\"zonule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05618976\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }