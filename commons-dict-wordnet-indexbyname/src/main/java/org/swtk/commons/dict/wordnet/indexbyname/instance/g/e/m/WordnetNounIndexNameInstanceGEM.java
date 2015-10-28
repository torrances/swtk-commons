package org.swtk.commons.dict.wordnet.indexbyname.instance.g.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGEM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gem\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03601980\", \"07706018\", \"10241326\", \"14723913\", \"03437882\"]}");
	add("{\"term\":\"gemara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06474326\"]}");
	add("{\"term\":\"gemfibrozil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03437989\"]}");
	add("{\"term\":\"geminate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134484\"]}");
	add("{\"term\":\"gemination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01021645\", \"07114919\"]}");
	add("{\"term\":\"gemini\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08704233\", \"09310519\", \"09771850\"]}");
	add("{\"term\":\"gemma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11703128\"]}");
	add("{\"term\":\"gemmation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13565276\"]}");
	add("{\"term\":\"gemmule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05898369\"]}");
	add("{\"term\":\"gemonil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03760508\"]}");
	add("{\"term\":\"gempylid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02624538\"]}");
	add("{\"term\":\"gempylidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02624351\"]}");
	add("{\"term\":\"gempylus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02624760\"]}");
	add("{\"term\":\"gemsbok\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02431154\"]}");
	add("{\"term\":\"gemsbuck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02431154\"]}");
	add("{\"term\":\"gemstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14723913\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }