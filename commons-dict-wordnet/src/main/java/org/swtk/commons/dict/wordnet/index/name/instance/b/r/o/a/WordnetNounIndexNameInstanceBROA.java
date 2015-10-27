package org.swtk.commons.dict.wordnet.index.name.instance.b.r.o.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBROA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"broach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02909763\"]}");
	add("{\"term\":\"broad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09895129\"]}");
	add("{\"term\":\"broadax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02906331\"]}");
	add("{\"term\":\"broadaxe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02906331\"]}");
	add("{\"term\":\"broadbill\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01549147\", \"01851617\", \"01854016\", \"02013935\"]}");
	add("{\"term\":\"broadcast\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06631935\", \"06264137\"]}");
	add("{\"term\":\"broadcaster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02906529\", \"09895252\"]}");
	add("{\"term\":\"broadcasting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06287350\", \"06274829\"]}");
	add("{\"term\":\"broadcloth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02907052\", \"02907177\"]}");
	add("{\"term\":\"broadening\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13596007\", \"00251464\", \"00408091\"]}");
	add("{\"term\":\"broadloom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02907558\"]}");
	add("{\"term\":\"broadness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05143608\"]}");
	add("{\"term\":\"broadsheet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07265007\"]}");
	add("{\"term\":\"broadside\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00990263\", \"02907673\", \"02907830\", \"07248075\", \"07265007\"]}");
	add("{\"term\":\"broadsword\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02907965\"]}");
	add("{\"term\":\"broadtail\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02416689\", \"14789327\"]}");
	add("{\"term\":\"broadway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09144753\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }