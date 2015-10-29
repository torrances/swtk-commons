package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lomariopsidaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13223647\"]}");
	add("{\"term\":\"lomatia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12241346\"]}");
	add("{\"term\":\"lombard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09722740\"]}");
	add("{\"term\":\"lombard street\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08614075\"]}");
	add("{\"term\":\"lombardia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08826466\"]}");
	add("{\"term\":\"lombardy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08826466\"]}");
	add("{\"term\":\"lombardy poplar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12753365\"]}");
	add("{\"term\":\"lome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08778061\"]}");
	add("{\"term\":\"loment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13160098\"]}");
	add("{\"term\":\"lomogramma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13224013\"]}");
	add("{\"term\":\"lomotil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03692930\"]}");
	add("{\"term\":\"lomustine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03693014\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }