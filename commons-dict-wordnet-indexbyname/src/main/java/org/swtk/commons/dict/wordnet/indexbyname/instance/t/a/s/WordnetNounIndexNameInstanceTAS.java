package org.swtk.commons.dict.wordnet.indexbyname.instance.t.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tashkent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09044908\"]}");
	add("{\"term\":\"tashmit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09545256\"]}");
	add("{\"term\":\"tashmitum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09545256\"]}");
	add("{\"term\":\"task\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00720957\", \"00797381\"]}");
	add("{\"term\":\"task force\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08225365\", \"08207539\"]}");
	add("{\"term\":\"taskent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09044908\"]}");
	add("{\"term\":\"taskmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10711765\"]}");
	add("{\"term\":\"taskmistress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10711901\"]}");
	add("{\"term\":\"tasman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11352063\"]}");
	add("{\"term\":\"tasman dwarf pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11677604\"]}");
	add("{\"term\":\"tasman sea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09478176\"]}");
	add("{\"term\":\"tasmania\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08852973\", \"08853115\"]}");
	add("{\"term\":\"tasmanian devil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01887475\"]}");
	add("{\"term\":\"tasmanian tiger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01887117\"]}");
	add("{\"term\":\"tasmanian wolf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01887117\"]}");
	add("{\"term\":\"tasse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04402467\"]}");
	add("{\"term\":\"tassel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04402336\"]}");
	add("{\"term\":\"tassel flower\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11844041\", \"11983774\", \"11984041\"]}");
	add("{\"term\":\"tassel hyacinth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12481614\"]}");
	add("{\"term\":\"tasset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04402467\"]}");
	add("{\"term\":\"tasso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11352245\"]}");
	add("{\"term\":\"taste\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00884380\", \"05666071\", \"07594444\", \"07302729\", \"05757616\", \"07513449\", \"05723230\"]}");
	add("{\"term\":\"taste bud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05312635\"]}");
	add("{\"term\":\"taste cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05312888\"]}");
	add("{\"term\":\"taste perception\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05723230\"]}");
	add("{\"term\":\"taste property\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04999341\"]}");
	add("{\"term\":\"taste sensation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05723230\"]}");
	add("{\"term\":\"taste tester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10711978\"]}");
	add("{\"term\":\"tastebud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05312635\"]}");
	add("{\"term\":\"tastefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04820644\"]}");
	add("{\"term\":\"tastelessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04825515\", \"05004197\"]}");
	add("{\"term\":\"taster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10711978\"]}");
	add("{\"term\":\"tastiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05002599\"]}");
	add("{\"term\":\"tasting\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00843562\", \"00884380\", \"05830972\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }