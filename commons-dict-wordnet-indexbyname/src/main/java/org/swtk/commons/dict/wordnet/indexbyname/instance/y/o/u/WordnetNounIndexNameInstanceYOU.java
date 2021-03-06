package org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYOU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"young\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"07960326\", \"11423216\", \"11423452\", \"11423596\", \"11423688\", \"11423824\", \"11424136\", \"11424276\", \"01324070\"]}");
	add("{\"term\":\"young bird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01616256\"]}");
	add("{\"term\":\"young buck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10823891\"]}");
	add("{\"term\":\"young carnivore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01325176\"]}");
	add("{\"term\":\"young fish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02516191\"]}");
	add("{\"term\":\"young girl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10267055\"]}");
	add("{\"term\":\"young lady\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10149362\"]}");
	add("{\"term\":\"young mammal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01324345\"]}");
	add("{\"term\":\"young man\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10823891\"]}");
	add("{\"term\":\"young person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10824010\"]}");
	add("{\"term\":\"young turk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10824240\", \"10824336\"]}");
	add("{\"term\":\"young woman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10149362\"]}");
	add("{\"term\":\"youngness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04935593\"]}");
	add("{\"term\":\"youngster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09937051\"]}");
	add("{\"term\":\"youngstown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09154233\"]}");
	add("{\"term\":\"younker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10824010\"]}");
	add("{\"term\":\"youth\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04935762\", \"15290845\", \"14449257\", \"15172673\", \"07960326\", \"10824010\"]}");
	add("{\"term\":\"youth crusade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00802938\"]}");
	add("{\"term\":\"youth culture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08306010\"]}");
	add("{\"term\":\"youth gang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08261668\"]}");
	add("{\"term\":\"youth hostel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03546717\"]}");
	add("{\"term\":\"youth movement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00802938\"]}");
	add("{\"term\":\"youth subculture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08306370\"]}");
	add("{\"term\":\"youthfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04935762\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }