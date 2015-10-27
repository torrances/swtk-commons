package org.swtk.commons.dict.wordnet.index.name.instance.b.a.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"band\", \"synsetCount\":13, \"upperType\":\"NOUN\", \"ids\":[\"02788021\", \"02788214\", \"02788388\", \"02788593\", \"04099721\", \"05274710\", \"02787241\", \"06271171\", \"08266881\", \"02787755\", \"04687822\", \"08265959\", \"08257090\"]}");
	add("{\"term\":\"bandage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02788671\"]}");
	add("{\"term\":\"bandaging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00698135\"]}");
	add("{\"term\":\"bandana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02789221\"]}");
	add("{\"term\":\"bandanna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02789221\"]}");
	add("{\"term\":\"bandbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02789354\"]}");
	add("{\"term\":\"bandeau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02896008\"]}");
	add("{\"term\":\"bandelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02716628\"]}");
	add("{\"term\":\"bandelette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02716628\"]}");
	add("{\"term\":\"banderilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02789486\"]}");
	add("{\"term\":\"banderillero\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09855731\"]}");
	add("{\"term\":\"bandicoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01878967\"]}");
	add("{\"term\":\"banding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02787755\", \"04687822\"]}");
	add("{\"term\":\"bandit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09856476\"]}");
	add("{\"term\":\"banditry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00968398\"]}");
	add("{\"term\":\"bandleader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09856589\"]}");
	add("{\"term\":\"bandlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02716628\"]}");
	add("{\"term\":\"bandmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09856748\"]}");
	add("{\"term\":\"bandoleer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02789634\"]}");
	add("{\"term\":\"bandolier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02789634\"]}");
	add("{\"term\":\"bandoneon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02789759\"]}");
	add("{\"term\":\"bandsaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02789860\"]}");
	add("{\"term\":\"bandsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09856847\"]}");
	add("{\"term\":\"bandstand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02790007\"]}");
	add("{\"term\":\"bandtail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01815507\"]}");
	add("{\"term\":\"bandung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08929706\"]}");
	add("{\"term\":\"bandwagon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02790143\", \"05759530\"]}");
	add("{\"term\":\"bandwidth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13600713\"]}");
	add("{\"term\":\"bandyleg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05569467\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }