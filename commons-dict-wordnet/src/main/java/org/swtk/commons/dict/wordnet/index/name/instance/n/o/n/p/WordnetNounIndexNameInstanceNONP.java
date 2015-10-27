package org.swtk.commons.dict.wordnet.index.name.instance.n.o.n.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNONP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nonpareil\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07620449\", \"07636873\", \"10344909\"]}");
	add("{\"term\":\"nonparticipant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10380995\"]}");
	add("{\"term\":\"nonparticipation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01242052\"]}");
	add("{\"term\":\"nonpartisan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10381089\"]}");
	add("{\"term\":\"nonpartisanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06212421\"]}");
	add("{\"term\":\"nonpartizan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10381089\"]}");
	add("{\"term\":\"nonpayment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01123176\", \"13321164\", \"13321434\"]}");
	add("{\"term\":\"nonperformance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00740568\"]}");
	add("{\"term\":\"nonperson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10381224\"]}");
	add("{\"term\":\"nonprofit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01139918\"]}");
	add("{\"term\":\"nonproliferation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01080496\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }