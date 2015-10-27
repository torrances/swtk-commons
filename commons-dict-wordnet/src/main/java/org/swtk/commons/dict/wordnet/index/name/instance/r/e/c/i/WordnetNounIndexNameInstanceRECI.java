package org.swtk.commons.dict.wordnet.index.name.instance.r.e.c.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRECI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"recidivism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00069437\"]}");
	add("{\"term\":\"recidivist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10530832\", \"10531018\"]}");
	add("{\"term\":\"recife\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08875467\"]}");
	add("{\"term\":\"recipe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06801642\"]}");
	add("{\"term\":\"recipient\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06344088\", \"09651094\"]}");
	add("{\"term\":\"reciprocal\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00852776\", \"13865372\", \"13865800\"]}");
	add("{\"term\":\"reciprocality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13863412\"]}");
	add("{\"term\":\"reciprocation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00040890\", \"00342261\", \"01238614\"]}");
	add("{\"term\":\"reciprocity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00041158\", \"13863412\"]}");
	add("{\"term\":\"recirculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00369323\"]}");
	add("{\"term\":\"recission\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00233730\"]}");
	add("{\"term\":\"recital\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07236416\", \"07249395\", \"07249541\", \"06906480\", \"07235433\"]}");
	add("{\"term\":\"recitalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10531242\"]}");
	add("{\"term\":\"recitation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00896250\", \"01234811\", \"07249541\", \"07249878\"]}");
	add("{\"term\":\"recitative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07101538\"]}");
	add("{\"term\":\"reciter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10531364\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }