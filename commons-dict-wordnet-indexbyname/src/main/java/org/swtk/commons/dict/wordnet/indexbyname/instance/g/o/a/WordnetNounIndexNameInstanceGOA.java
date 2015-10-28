package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"goa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08925154\"]}");
	add("{\"term\":\"goad\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07267046\", \"04014040\"]}");
	add("{\"term\":\"goading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07267046\"]}");
	add("{\"term\":\"goal\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00188186\", \"03447680\", \"08585406\", \"05989760\"]}");
	add("{\"term\":\"goalie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00465105\", \"10153521\"]}");
	add("{\"term\":\"goalkeeper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00465105\", \"10153521\"]}");
	add("{\"term\":\"goalmouth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03447929\"]}");
	add("{\"term\":\"goalpost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03448073\"]}");
	add("{\"term\":\"goaltender\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00465105\", \"10153521\"]}");
	add("{\"term\":\"goat\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08705447\", \"09772829\", \"09904118\", \"02419165\"]}");
	add("{\"term\":\"goatee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05270528\"]}");
	add("{\"term\":\"goatfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02602928\"]}");
	add("{\"term\":\"goatherd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10153698\"]}");
	add("{\"term\":\"goatsbeard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12048127\"]}");
	add("{\"term\":\"goatsfoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724476\"]}");
	add("{\"term\":\"goatskin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14783694\"]}");
	add("{\"term\":\"goatsucker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01837917\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }