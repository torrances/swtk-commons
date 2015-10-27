package org.swtk.commons.dict.wordnet.index.name.instance.t.a.b.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTABL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tablature\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06829193\"]}");
	add("{\"term\":\"table\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"07580824\", \"08497146\", \"09374802\", \"04387051\", \"04386330\", \"08283156\"]}");
	add("{\"term\":\"tableau\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05943498\", \"08389642\"]}");
	add("{\"term\":\"tablecloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04387230\"]}");
	add("{\"term\":\"tablefork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04387342\"]}");
	add("{\"term\":\"tableland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09476138\"]}");
	add("{\"term\":\"tablemate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10707322\"]}");
	add("{\"term\":\"tablespoon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04388160\", \"13792450\"]}");
	add("{\"term\":\"tablespoonful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13792450\"]}");
	add("{\"term\":\"tablet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03942844\", \"04388270\", \"14997692\", \"04388389\"]}");
	add("{\"term\":\"tabletop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04388947\"]}");
	add("{\"term\":\"tableware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389081\"]}");
	add("{\"term\":\"tabloid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06278546\", \"06278644\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }