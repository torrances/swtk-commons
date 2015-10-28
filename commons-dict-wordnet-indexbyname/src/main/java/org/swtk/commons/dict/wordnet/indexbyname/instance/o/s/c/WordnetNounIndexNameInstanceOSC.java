package org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOSC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oscan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06975090\", \"09737185\"]}");
	add("{\"term\":\"oscar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07283672\"]}");
	add("{\"term\":\"oscheocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14341543\"]}");
	add("{\"term\":\"oscheocoele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14341543\"]}");
	add("{\"term\":\"oscillation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07355638\", \"07359766\", \"13549168\"]}");
	add("{\"term\":\"oscillator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03862950\"]}");
	add("{\"term\":\"oscillatoriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01362129\"]}");
	add("{\"term\":\"oscillogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03863108\"]}");
	add("{\"term\":\"oscillograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03863207\"]}");
	add("{\"term\":\"oscilloscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03863348\"]}");
	add("{\"term\":\"oscine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01528361\"]}");
	add("{\"term\":\"oscines\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01527526\"]}");
	add("{\"term\":\"oscitance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00838954\", \"14054153\"]}");
	add("{\"term\":\"oscitancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00838954\", \"14054153\"]}");
	add("{\"term\":\"osculation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00139041\", \"14443293\"]}");
	add("{\"term\":\"osculator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10256893\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }