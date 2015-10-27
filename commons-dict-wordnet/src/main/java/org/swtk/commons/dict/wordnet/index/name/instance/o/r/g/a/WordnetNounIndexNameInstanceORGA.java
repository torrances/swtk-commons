package org.swtk.commons.dict.wordnet.index.name.instance.o.r.g.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORGA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"organ\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03499638\", \"03859585\", \"06607260\", \"03278462\", \"08366277\", \"05305022\"]}");
	add("{\"term\":\"organdie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03859941\"]}");
	add("{\"term\":\"organdy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03859941\"]}");
	add("{\"term\":\"organelle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05453244\"]}");
	add("{\"term\":\"organic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14883989\"]}");
	add("{\"term\":\"organicism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06003591\"]}");
	add("{\"term\":\"organification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13548929\"]}");
	add("{\"term\":\"organisation\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00237945\", \"01010320\", \"01138840\", \"04775896\", \"05734541\", \"08024893\", \"08181484\"]}");
	add("{\"term\":\"organiser\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03924859\", \"10402936\", \"10403204\"]}");
	add("{\"term\":\"organism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08453046\", \"00004475\"]}");
	add("{\"term\":\"organist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10402524\"]}");
	add("{\"term\":\"organization\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00237945\", \"01010320\", \"04775896\", \"01138840\", \"08181484\", \"05734541\", \"08024893\"]}");
	add("{\"term\":\"organizer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03924859\", \"10403204\", \"10402936\"]}");
	add("{\"term\":\"organon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05672830\"]}");
	add("{\"term\":\"organophosphate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14994553\"]}");
	add("{\"term\":\"organs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07667063\"]}");
	add("{\"term\":\"organza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03860734\"]}");
	add("{\"term\":\"orgasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00062953\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }