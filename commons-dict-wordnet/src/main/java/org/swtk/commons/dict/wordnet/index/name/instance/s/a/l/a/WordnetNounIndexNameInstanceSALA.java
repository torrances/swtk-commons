package org.swtk.commons.dict.wordnet.index.name.instance.s.a.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSALA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"salaah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05922953\"]}");
	add("{\"term\":\"salaam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07290418\"]}");
	add("{\"term\":\"salaat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05922953\"]}");
	add("{\"term\":\"salability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04739477\"]}");
	add("{\"term\":\"salableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04739477\"]}");
	add("{\"term\":\"salaciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04910545\"]}");
	add("{\"term\":\"salacity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04910545\"]}");
	add("{\"term\":\"salad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07822197\"]}");
	add("{\"term\":\"salade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04137990\"]}");
	add("{\"term\":\"saladin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11298746\"]}");
	add("{\"term\":\"salafism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06246131\"]}");
	add("{\"term\":\"salah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05922953\"]}");
	add("{\"term\":\"salai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12712921\"]}");
	add("{\"term\":\"salal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12256677\"]}");
	add("{\"term\":\"salamander\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03982284\", \"09524559\", \"01631917\"]}");
	add("{\"term\":\"salamandra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01631734\"]}");
	add("{\"term\":\"salamandridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01631526\"]}");
	add("{\"term\":\"salami\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07693492\"]}");
	add("{\"term\":\"salary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13300285\"]}");
	add("{\"term\":\"salat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05922953\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }