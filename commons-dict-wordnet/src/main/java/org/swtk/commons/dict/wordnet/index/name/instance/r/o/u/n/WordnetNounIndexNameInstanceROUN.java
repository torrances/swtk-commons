package org.swtk.commons.dict.wordnet.index.name.instance.r.o.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"round\", \"synsetCount\":14, \"upperType\":\"NOUN\", \"ids\":[\"03036796\", \"04126986\", \"06705209\", \"07067129\", \"07677901\", \"07900241\", \"09439975\", \"15281525\", \"00416111\", \"00467445\", \"01057612\", \"08524402\", \"15313066\", \"04120735\"]}");
	add("{\"term\":\"roundabout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02969645\", \"04473168\"]}");
	add("{\"term\":\"roundedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05077622\"]}");
	add("{\"term\":\"roundel\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02716785\", \"04121163\", \"06392757\"]}");
	add("{\"term\":\"roundelay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07067531\"]}");
	add("{\"term\":\"rounder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04121287\", \"10277344\"]}");
	add("{\"term\":\"rounders\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00477151\"]}");
	add("{\"term\":\"roundhead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10560083\", \"10560213\"]}");
	add("{\"term\":\"roundhouse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00137050\", \"04121522\"]}");
	add("{\"term\":\"rounding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00073997\"]}");
	add("{\"term\":\"roundness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05008078\", \"05080080\", \"05130471\", \"07097164\"]}");
	add("{\"term\":\"roundsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10560292\"]}");
	add("{\"term\":\"roundtable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07160022\"]}");
	add("{\"term\":\"roundup\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00636787\", \"06481268\", \"00923441\"]}");
	add("{\"term\":\"roundworm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01932753\", \"14148948\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }