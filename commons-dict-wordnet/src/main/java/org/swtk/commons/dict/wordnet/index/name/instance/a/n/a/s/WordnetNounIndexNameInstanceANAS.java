package org.swtk.commons.dict.wordnet.index.name.instance.a.n.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01850206\"]}");
	add("{\"term\":\"anasa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02242311\"]}");
	add("{\"term\":\"anasarca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14339324\"]}");
	add("{\"term\":\"anasazi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09667311\"]}");
	add("{\"term\":\"anaspid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01478581\"]}");
	add("{\"term\":\"anaspida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01478435\"]}");
	add("{\"term\":\"anastalsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13452742\"]}");
	add("{\"term\":\"anastatica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11891385\"]}");
	add("{\"term\":\"anastigmat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02711960\"]}");
	add("{\"term\":\"anastomosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05256902\"]}");
	add("{\"term\":\"anastomus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02006110\"]}");
	add("{\"term\":\"anastrophe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07115806\"]}");
	add("{\"term\":\"anastylosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00270315\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }