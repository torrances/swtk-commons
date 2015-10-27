package org.swtk.commons.dict.wordnet.index.name.instance.l.i.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIBE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"libel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06574427\", \"06733120\"]}");
	add("{\"term\":\"libeler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10018655\"]}");
	add("{\"term\":\"liberal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10276781\", \"10276453\"]}");
	add("{\"term\":\"liberalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00356517\"]}");
	add("{\"term\":\"liberalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06004479\", \"06228560\"]}");
	add("{\"term\":\"liberalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10276453\"]}");
	add("{\"term\":\"liberality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04839749\", \"06214555\"]}");
	add("{\"term\":\"liberalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00356517\"]}");
	add("{\"term\":\"liberalness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04839749\", \"06214555\"]}");
	add("{\"term\":\"liberation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00217041\", \"00789493\", \"00096322\"]}");
	add("{\"term\":\"liberator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10276918\"]}");
	add("{\"term\":\"liberia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08979027\"]}");
	add("{\"term\":\"liberian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09740238\"]}");
	add("{\"term\":\"libertarian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10277099\", \"10277221\"]}");
	add("{\"term\":\"libertarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06229122\"]}");
	add("{\"term\":\"libertine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10277344\"]}");
	add("{\"term\":\"liberty\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00738368\", \"15165040\", \"14019546\", \"14017941\", \"14015999\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }