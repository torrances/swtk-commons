package org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAGE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"age\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"15178747\", \"15267766\", \"15170131\", \"15278839\", \"04931280\"]}");
	add("{\"term\":\"aged\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07960146\"]}");
	add("{\"term\":\"agedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04934809\"]}");
	add("{\"term\":\"agee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10829180\"]}");
	add("{\"term\":\"ageing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13450179\", \"13573168\"]}");
	add("{\"term\":\"ageism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01156868\"]}");
	add("{\"term\":\"agelaius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01577911\"]}");
	add("{\"term\":\"agelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04749658\"]}");
	add("{\"term\":\"agency\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00173531\", \"14023888\", \"14031031\", \"08073958\", \"08354251\"]}");
	add("{\"term\":\"agenda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06496950\", \"05919534\"]}");
	add("{\"term\":\"agendum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06496950\"]}");
	add("{\"term\":\"agene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15041688\"]}");
	add("{\"term\":\"agenesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13449481\"]}");
	add("{\"term\":\"agenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13449481\"]}");
	add("{\"term\":\"agent\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06343357\", \"10393500\", \"09796453\", \"14802595\", \"09796794\", \"09213796\"]}");
	add("{\"term\":\"agerasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04681981\"]}");
	add("{\"term\":\"ageratina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11938102\"]}");
	add("{\"term\":\"ageratum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11938755\", \"11976365\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }