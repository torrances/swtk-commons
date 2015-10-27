package org.swtk.commons.dict.wordnet.index.name.instance.e.x.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXTE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"extemporisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00100408\"]}");
	add("{\"term\":\"extemporization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00100408\"]}");
	add("{\"term\":\"extension\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"02716453\", \"03286846\", \"03311814\", \"05140800\", \"05221867\", \"05931581\", \"06346173\", \"00370340\", \"00887717\", \"06263648\", \"00368594\", \"15297368\"]}");
	add("{\"term\":\"extensiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05113617\"]}");
	add("{\"term\":\"extensor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05302105\"]}");
	add("{\"term\":\"extent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05130681\", \"13964158\"]}");
	add("{\"term\":\"extenuation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00355409\", \"06754423\"]}");
	add("{\"term\":\"exterior\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08631047\", \"08631168\"]}");
	add("{\"term\":\"exteriorisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00934439\"]}");
	add("{\"term\":\"exteriorization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00934439\"]}");
	add("{\"term\":\"extermination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01247608\", \"07347291\"]}");
	add("{\"term\":\"exterminator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10094127\"]}");
	add("{\"term\":\"extern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10094366\"]}");
	add("{\"term\":\"external\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05860572\"]}");
	add("{\"term\":\"externalisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00934439\", \"05743625\"]}");
	add("{\"term\":\"externality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05085830\"]}");
	add("{\"term\":\"externalization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00934439\", \"05743625\"]}");
	add("{\"term\":\"exteroception\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05661693\"]}");
	add("{\"term\":\"exteroceptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05307313\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }