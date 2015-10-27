package org.swtk.commons.dict.wordnet.index.name.instance.s.u.m.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUMM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"summarisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06479116\"]}");
	add("{\"term\":\"summarization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06479116\"]}");
	add("{\"term\":\"summary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06478678\"]}");
	add("{\"term\":\"summation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00873785\", \"07975630\", \"13584342\", \"06481545\"]}");
	add("{\"term\":\"summer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15169972\", \"15262047\"]}");
	add("{\"term\":\"summercater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10658636\"]}");
	add("{\"term\":\"summercaters\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10694031\"]}");
	add("{\"term\":\"summerhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03435328\"]}");
	add("{\"term\":\"summersault\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00440424\"]}");
	add("{\"term\":\"summerset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00440424\"]}");
	add("{\"term\":\"summertime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15262047\"]}");
	add("{\"term\":\"summit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08329289\", \"08635538\", \"13963489\"]}");
	add("{\"term\":\"summoning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05987490\"]}");
	add("{\"term\":\"summons\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06568683\", \"07183749\", \"07201188\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }