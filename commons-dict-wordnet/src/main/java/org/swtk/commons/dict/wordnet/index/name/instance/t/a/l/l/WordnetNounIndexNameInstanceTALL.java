package org.swtk.commons.dict.wordnet.index.name.instance.t.a.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTALL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05104540\"]}");
	add("{\"term\":\"tallahassee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09097675\"]}");
	add("{\"term\":\"tallapoosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09477017\"]}");
	add("{\"term\":\"tallboy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03523468\"]}");
	add("{\"term\":\"tallchief\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11349502\"]}");
	add("{\"term\":\"talleyrand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11349685\"]}");
	add("{\"term\":\"tallgrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12124755\"]}");
	add("{\"term\":\"tallin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09034900\"]}");
	add("{\"term\":\"tallinn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09034900\"]}");
	add("{\"term\":\"tallis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04004691\", \"11349803\"]}");
	add("{\"term\":\"tallith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04004691\"]}");
	add("{\"term\":\"tallness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05009705\", \"05144430\"]}");
	add("{\"term\":\"tallow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15087035\"]}");
	add("{\"term\":\"tally\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00635829\", \"06529770\", \"00190414\"]}");
	add("{\"term\":\"tallyman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10709764\", \"10709917\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }