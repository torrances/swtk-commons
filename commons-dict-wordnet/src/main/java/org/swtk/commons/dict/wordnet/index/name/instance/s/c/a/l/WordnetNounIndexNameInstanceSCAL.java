package org.swtk.commons.dict.wordnet.index.name.instance.s.c.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scalability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05217384\"]}");
	add("{\"term\":\"scalage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01007756\", \"01007899\"]}");
	add("{\"term\":\"scalar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05872935\"]}");
	add("{\"term\":\"scalawag\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10219666\", \"10556285\", \"10574094\"]}");
	add("{\"term\":\"scald\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00404879\", \"14313609\"]}");
	add("{\"term\":\"scale\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"01905518\", \"03965995\", \"04148903\", \"04149040\", \"06869618\", \"09448485\", \"13176554\", \"13839074\", \"13837554\", \"13872501\"]}");
	add("{\"term\":\"scalenus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05597794\"]}");
	add("{\"term\":\"scaler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04149240\"]}");
	add("{\"term\":\"scaliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04955780\"]}");
	add("{\"term\":\"scaling\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00326190\", \"01007226\", \"01012276\"]}");
	add("{\"term\":\"scallion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07738230\", \"12454744\"]}");
	add("{\"term\":\"scallop\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01968530\", \"07670495\", \"07813617\", \"13897197\"]}");
	add("{\"term\":\"scallopine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07892257\"]}");
	add("{\"term\":\"scallopini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07892257\"]}");
	add("{\"term\":\"scallywag\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10219666\", \"10556285\", \"10574094\"]}");
	add("{\"term\":\"scalp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05547580\"]}");
	add("{\"term\":\"scalpel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04149499\"]}");
	add("{\"term\":\"scalper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10574274\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }