package org.swtk.commons.dict.wordnet.index.name.instance.l.e.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLETT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"letter\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06719443\", \"07188040\", \"10274904\", \"06841868\", \"06636668\"]}");
	add("{\"term\":\"lettercard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06640632\"]}");
	add("{\"term\":\"letterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275045\"]}");
	add("{\"term\":\"letterhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06269680\"]}");
	add("{\"term\":\"lettering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06417342\"]}");
	add("{\"term\":\"letterman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275156\"]}");
	add("{\"term\":\"letterpress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06691409\"]}");
	add("{\"term\":\"letters\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05995180\", \"05760419\"]}");
	add("{\"term\":\"letting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13269292\"]}");
	add("{\"term\":\"lettish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06959117\"]}");
	add("{\"term\":\"lettuce\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07739304\", \"12006775\", \"13406389\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }