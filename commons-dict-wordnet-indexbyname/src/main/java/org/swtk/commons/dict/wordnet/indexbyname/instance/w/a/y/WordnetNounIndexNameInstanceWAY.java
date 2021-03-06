package org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"way\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"13306996\", \"05848419\", \"05799772\", \"05091940\", \"13799976\", \"00313517\", \"04571984\", \"00416689\", \"13962637\", \"08697710\", \"00173531\", \"04936080\"]}");
	add("{\"term\":\"way of life\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00416689\"]}");
	add("{\"term\":\"way out\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03308910\"]}");
	add("{\"term\":\"way station\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04587081\", \"08674731\"]}");
	add("{\"term\":\"waybill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06532733\"]}");
	add("{\"term\":\"wayfarer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10791060\", \"10791207\"]}");
	add("{\"term\":\"wayfaring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00298144\"]}");
	add("{\"term\":\"wayfaring tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12701413\"]}");
	add("{\"term\":\"wayland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09608393\"]}");
	add("{\"term\":\"wayland the smith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09608393\"]}");
	add("{\"term\":\"wayne\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11397559\", \"11397707\"]}");
	add("{\"term\":\"wayne gretzky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11035521\"]}");
	add("{\"term\":\"ways\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04572325\"]}");
	add("{\"term\":\"ways and means\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13387151\"]}");
	add("{\"term\":\"ways and means committee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08343417\"]}");
	add("{\"term\":\"wayside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04572519\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }