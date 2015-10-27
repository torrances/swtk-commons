package org.swtk.commons.dict.wordnet.index.name.instance.r.e.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"repeal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00232754\"]}");
	add("{\"term\":\"repeat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07356649\"]}");
	add("{\"term\":\"repeater\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04083164\", \"04083396\", \"10531018\", \"10541063\"]}");
	add("{\"term\":\"repeating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01020572\"]}");
	add("{\"term\":\"repechage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07479191\"]}");
	add("{\"term\":\"repellant\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05203322\", \"14944539\", \"14944737\"]}");
	add("{\"term\":\"repellent\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05203322\", \"14944539\", \"14944737\"]}");
	add("{\"term\":\"repentance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07552258\"]}");
	add("{\"term\":\"repercussion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07364792\", \"11436836\"]}");
	add("{\"term\":\"repertoire\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08353554\", \"08353771\"]}");
	add("{\"term\":\"repertory\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08204487\", \"08353554\", \"08353771\", \"04083545\"]}");
	add("{\"term\":\"repetition\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07113937\", \"01020572\", \"07356649\"]}");
	add("{\"term\":\"repetitiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07104913\"]}");
	add("{\"term\":\"repetitiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07104913\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }