package org.swtk.commons.dict.wordnet.indexbyname.instance.g.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gum\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"12354810\", \"12355037\", \"14727036\", \"14922621\", \"05312431\", \"07615569\"]}");
	add("{\"term\":\"gumbo\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07601477\", \"07749370\", \"12192483\", \"14927747\"]}");
	add("{\"term\":\"gumboil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14206819\"]}");
	add("{\"term\":\"gumdrop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07621553\"]}");
	add("{\"term\":\"gumma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14262302\"]}");
	add("{\"term\":\"gumminess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943081\"]}");
	add("{\"term\":\"gumming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00280079\"]}");
	add("{\"term\":\"gummite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14928203\"]}");
	add("{\"term\":\"gummosis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14302455\", \"14302601\"]}");
	add("{\"term\":\"gumption\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05039506\", \"05622440\"]}");
	add("{\"term\":\"gumshield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03800791\"]}");
	add("{\"term\":\"gumshoe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02738543\", \"10031439\"]}");
	add("{\"term\":\"gumweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11993810\"]}");
	add("{\"term\":\"gumwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12355037\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }