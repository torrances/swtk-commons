package org.swtk.commons.dict.wordnet.index.name.instance.p.a.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePALA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"palace\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03883542\", \"03883908\", \"08069873\", \"03883763\"]}");
	add("{\"term\":\"paladin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09925991\"]}");
	add("{\"term\":\"palaeencephalon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05489781\"]}");
	add("{\"term\":\"palaemon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01989994\"]}");
	add("{\"term\":\"palaemonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01989869\"]}");
	add("{\"term\":\"palaeoanthropology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06083739\"]}");
	add("{\"term\":\"palaeobiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06088274\"]}");
	add("{\"term\":\"palaeobotany\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06083922\"]}");
	add("{\"term\":\"palaeoclimatology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06154777\"]}");
	add("{\"term\":\"palaeodendrology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06084278\"]}");
	add("{\"term\":\"palaeoecology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06092297\"]}");
	add("{\"term\":\"palaeoethnography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06156211\"]}");
	add("{\"term\":\"palaeogeography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06154897\"]}");
	add("{\"term\":\"palaeogeology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06127002\"]}");
	add("{\"term\":\"palaeolithic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15257202\"]}");
	add("{\"term\":\"palaeology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06155593\"]}");
	add("{\"term\":\"palaeontologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10414485\"]}");
	add("{\"term\":\"palaeontology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06083438\"]}");
	add("{\"term\":\"palaeopathology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06155180\"]}");
	add("{\"term\":\"palaeornithology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06084662\"]}");
	add("{\"term\":\"palaeozoology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06084410\"]}");
	add("{\"term\":\"palaestra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03884208\"]}");
	add("{\"term\":\"palaetiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06155348\"]}");
	add("{\"term\":\"palaic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06988978\"]}");
	add("{\"term\":\"palankeen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03883991\"]}");
	add("{\"term\":\"palanquin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03883991\"]}");
	add("{\"term\":\"palaquium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12795651\"]}");
	add("{\"term\":\"palas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12530848\"]}");
	add("{\"term\":\"palatability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04801829\", \"05002389\"]}");
	add("{\"term\":\"palatableness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04801829\", \"05002389\"]}");
	add("{\"term\":\"palatal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07129243\"]}");
	add("{\"term\":\"palate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05317250\"]}");
	add("{\"term\":\"palatinate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08570961\", \"08793272\"]}");
	add("{\"term\":\"palatine\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05285651\", \"08815264\", \"10413840\", \"10414028\"]}");
	add("{\"term\":\"palatopharyngoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00690982\"]}");
	add("{\"term\":\"palau\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09000318\", \"09000531\"]}");
	add("{\"term\":\"palaver\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06621856\", \"06708607\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }