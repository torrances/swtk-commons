package org.swtk.commons.dict.wordnet.index.name.instance.l.e.g.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEGI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"legibility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04826516\", \"04710452\"]}");
	add("{\"term\":\"leging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03660398\"]}");
	add("{\"term\":\"legion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08199880\", \"08288722\", \"08289169\", \"08200720\"]}");
	add("{\"term\":\"legionary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10273400\"]}");
	add("{\"term\":\"legionella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01376865\"]}");
	add("{\"term\":\"legionnaire\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10273400\", \"10273584\"]}");
	add("{\"term\":\"legislating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01128014\"]}");
	add("{\"term\":\"legislation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01128014\", \"06547213\"]}");
	add("{\"term\":\"legislator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10273692\"]}");
	add("{\"term\":\"legislatorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00595489\"]}");
	add("{\"term\":\"legislature\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08180172\"]}");
	add("{\"term\":\"legitimacy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04790511\", \"04817287\"]}");
	add("{\"term\":\"legitimation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01197870\", \"01198074\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }