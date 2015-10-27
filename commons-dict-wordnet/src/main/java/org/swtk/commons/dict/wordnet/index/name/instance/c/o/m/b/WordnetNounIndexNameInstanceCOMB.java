package org.swtk.commons.dict.wordnet.index.name.instance.c.o.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"comb\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00257613\", \"01924081\", \"03079101\", \"01794896\", \"03078859\"]}");
	add("{\"term\":\"combat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01173452\", \"00966454\"]}");
	add("{\"term\":\"combatant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09958771\"]}");
	add("{\"term\":\"combativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04844846\"]}");
	add("{\"term\":\"comber\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03079252\", \"07367217\", \"09959484\"]}");
	add("{\"term\":\"combination\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00379793\", \"00872131\", \"07981109\", \"08289882\", \"08390471\", \"08390650\", \"07980325\"]}");
	add("{\"term\":\"combine\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07388403\", \"08253542\", \"03079638\"]}");
	add("{\"term\":\"combing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00257613\"]}");
	add("{\"term\":\"combining\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00379793\", \"07388403\"]}");
	add("{\"term\":\"combo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08267223\"]}");
	add("{\"term\":\"combretaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12343928\"]}");
	add("{\"term\":\"combretum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12344573\"]}");
	add("{\"term\":\"combustibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04719681\"]}");
	add("{\"term\":\"combustible\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14840915\"]}");
	add("{\"term\":\"combustibleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04719681\"]}");
	add("{\"term\":\"combustion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00378877\", \"14002399\", \"13471379\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }