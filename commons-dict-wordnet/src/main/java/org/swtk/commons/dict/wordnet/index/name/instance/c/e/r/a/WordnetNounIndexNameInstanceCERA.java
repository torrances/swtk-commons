package org.swtk.commons.dict.wordnet.index.name.instance.c.e.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCERA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cerambycidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02171194\"]}");
	add("{\"term\":\"ceramic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03000998\"]}");
	add("{\"term\":\"ceramicist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10480372\"]}");
	add("{\"term\":\"ceramics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00937062\"]}");
	add("{\"term\":\"ceramist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10480372\"]}");
	add("{\"term\":\"cerapteryx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02298802\"]}");
	add("{\"term\":\"ceras\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01956645\"]}");
	add("{\"term\":\"cerastes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01756129\"]}");
	add("{\"term\":\"cerastium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11827444\"]}");
	add("{\"term\":\"cerate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03001380\"]}");
	add("{\"term\":\"ceratin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14756651\"]}");
	add("{\"term\":\"ceratitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02199700\"]}");
	add("{\"term\":\"ceratodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02519058\"]}");
	add("{\"term\":\"ceratodus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02519407\"]}");
	add("{\"term\":\"ceratonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12513595\"]}");
	add("{\"term\":\"ceratopetalum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12807956\"]}");
	add("{\"term\":\"ceratophyllaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11722372\"]}");
	add("{\"term\":\"ceratophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11722550\"]}");
	add("{\"term\":\"ceratopogon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02205530\"]}");
	add("{\"term\":\"ceratopogonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02205161\"]}");
	add("{\"term\":\"ceratopsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01705982\"]}");
	add("{\"term\":\"ceratopsian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01706210\"]}");
	add("{\"term\":\"ceratopsidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01706507\"]}");
	add("{\"term\":\"ceratopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13192547\"]}");
	add("{\"term\":\"ceratosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01715393\"]}");
	add("{\"term\":\"ceratosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01715393\"]}");
	add("{\"term\":\"ceratostomataceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12985332\"]}");
	add("{\"term\":\"ceratostomella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12985510\"]}");
	add("{\"term\":\"ceratotherium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02395362\"]}");
	add("{\"term\":\"ceratozamia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11622929\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }