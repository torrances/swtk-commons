package org.swtk.commons.dict.wordnet.index.name.instance.b.a.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBART {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09860027\"]}");
	add("{\"term\":\"bartender\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09860576\"]}");
	add("{\"term\":\"barter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01111592\"]}");
	add("{\"term\":\"barterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09860788\"]}");
	add("{\"term\":\"barth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10855780\", \"10855904\"]}");
	add("{\"term\":\"barthelme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10856009\"]}");
	add("{\"term\":\"bartholdi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10856151\"]}");
	add("{\"term\":\"bartholin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10856321\"]}");
	add("{\"term\":\"bartlesville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09154741\"]}");
	add("{\"term\":\"bartlett\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07784206\", \"10856458\", \"10856619\"]}");
	add("{\"term\":\"bartok\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10856854\"]}");
	add("{\"term\":\"bartonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12056376\"]}");
	add("{\"term\":\"bartramia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02032225\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }