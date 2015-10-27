package org.swtk.commons.dict.wordnet.index.name.instance.g.r.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGRAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gram\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11030932\", \"13745822\"]}");
	add("{\"term\":\"grama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12132525\"]}");
	add("{\"term\":\"gramicidin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03456999\"]}");
	add("{\"term\":\"graminaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12121055\"]}");
	add("{\"term\":\"graminales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12120899\"]}");
	add("{\"term\":\"gramineae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12121055\"]}");
	add("{\"term\":\"gramma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12132525\"]}");
	add("{\"term\":\"grammar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06184139\"]}");
	add("{\"term\":\"grammarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10160884\"]}");
	add("{\"term\":\"grammatolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01046907\"]}");
	add("{\"term\":\"grammatophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12084388\"]}");
	add("{\"term\":\"gramme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13745822\"]}");
	add("{\"term\":\"gramophone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03457211\"]}");
	add("{\"term\":\"gramps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10161911\"]}");
	add("{\"term\":\"grampus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02073680\", \"02073946\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }