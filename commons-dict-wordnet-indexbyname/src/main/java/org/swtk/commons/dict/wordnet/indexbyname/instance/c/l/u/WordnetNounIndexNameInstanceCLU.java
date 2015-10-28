package org.swtk.commons.dict.wordnet.indexbyname.instance.c.l.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"club\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02934801\", \"03057773\", \"03451003\", \"03058296\", \"03057459\", \"08244135\", \"08096490\"]}");
	add("{\"term\":\"clubbing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14326367\"]}");
	add("{\"term\":\"clubfoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14238066\"]}");
	add("{\"term\":\"clubhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03451212\"]}");
	add("{\"term\":\"clubhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03058296\"]}");
	add("{\"term\":\"clubroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03058476\"]}");
	add("{\"term\":\"cluck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07395700\"]}");
	add("{\"term\":\"clucking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07395700\"]}");
	add("{\"term\":\"clue\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06656526\", \"06815643\"]}");
	add("{\"term\":\"clumber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02104208\"]}");
	add("{\"term\":\"clump\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07411545\", \"07977630\", \"07976557\"]}");
	add("{\"term\":\"clumping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07395534\"]}");
	add("{\"term\":\"clumsiness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04822855\", \"05011459\", \"05656304\"]}");
	add("{\"term\":\"clunch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14838701\"]}");
	add("{\"term\":\"clunk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07411545\"]}");
	add("{\"term\":\"clunking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07395534\"]}");
	add("{\"term\":\"clupea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02534451\"]}");
	add("{\"term\":\"clupeid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02532403\"]}");
	add("{\"term\":\"clupeidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02532146\"]}");
	add("{\"term\":\"clusia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12386417\"]}");
	add("{\"term\":\"clusiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12384505\"]}");
	add("{\"term\":\"cluster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07976557\"]}");
	add("{\"term\":\"clustering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07976557\"]}");
	add("{\"term\":\"clutch\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"03058886\", \"03059144\", \"03059403\", \"08417409\", \"08417827\", \"14056219\", \"00814187\"]}");
	add("{\"term\":\"clutches\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00814187\"]}");
	add("{\"term\":\"clutter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07278413\", \"14524151\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }