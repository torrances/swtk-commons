package org.swtk.commons.dict.wordnet.index.name.instance.s.c.i.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCIA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sciadopityaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11680360\"]}");
	add("{\"term\":\"sciadopitys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11680572\"]}");
	add("{\"term\":\"sciaena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02598532\"]}");
	add("{\"term\":\"sciaenid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02596880\"]}");
	add("{\"term\":\"sciaenidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02596493\"]}");
	add("{\"term\":\"sciaenops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02598199\"]}");
	add("{\"term\":\"sciara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02207374\"]}");
	add("{\"term\":\"sciarid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02207374\"]}");
	add("{\"term\":\"sciaridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02207112\"]}");
	add("{\"term\":\"sciatica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14354132\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }