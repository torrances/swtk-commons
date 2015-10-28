package org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCUB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cub\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01325176\", \"09890635\", \"10001364\"]}");
	add("{\"term\":\"cuba\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08767984\", \"08768167\"]}");
	add("{\"term\":\"cuban\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09718297\"]}");
	add("{\"term\":\"cubby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03149031\"]}");
	add("{\"term\":\"cubbyhole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03149031\", \"03149152\"]}");
	add("{\"term\":\"cube\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03149258\", \"12565367\", \"13753351\", \"13937623\", \"13939754\"]}");
	add("{\"term\":\"cubeb\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03149422\", \"13170955\", \"13171155\"]}");
	add("{\"term\":\"cubicity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05070898\"]}");
	add("{\"term\":\"cubicle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02877081\", \"02971792\", \"02995010\"]}");
	add("{\"term\":\"cubism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08483186\"]}");
	add("{\"term\":\"cubist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10001543\"]}");
	add("{\"term\":\"cubit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13674967\"]}");
	add("{\"term\":\"cubitiere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03149539\"]}");
	add("{\"term\":\"cubitus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05571862\", \"05587575\"]}");
	add("{\"term\":\"cuboid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13907587\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }