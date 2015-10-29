package org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fond regard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07560531\"]}");
	add("{\"term\":\"fonda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10994025\", \"10994128\"]}");
	add("{\"term\":\"fondant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07620989\"]}");
	add("{\"term\":\"fondler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10120083\", \"10440394\"]}");
	add("{\"term\":\"fondling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00855630\"]}");
	add("{\"term\":\"fondness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04634357\", \"07560035\", \"07512937\"]}");
	add("{\"term\":\"fondu\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07883397\", \"07883859\"]}");
	add("{\"term\":\"fondue\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07883397\", \"07883859\"]}");
	add("{\"term\":\"font\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02791595\", \"06838449\"]}");
	add("{\"term\":\"font cartridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06839457\"]}");
	add("{\"term\":\"fontanel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05552845\"]}");
	add("{\"term\":\"fontanelle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05552845\"]}");
	add("{\"term\":\"fontanne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10994263\"]}");
	add("{\"term\":\"fontenoy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01281366\"]}");
	add("{\"term\":\"fonteyn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10994447\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }