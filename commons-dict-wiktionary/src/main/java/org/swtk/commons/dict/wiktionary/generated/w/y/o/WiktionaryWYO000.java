package org.swtk.commons.dict.wiktionary.generated.w.y.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWYO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("wyoming", "{\"term\":\"wyoming\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"munsee\"], \"text\":\"Munsee \u0027xwé:wamənk\u0027 (at the big river flat) ossible source of the place name for the village of Wyoming, Plympton Township, Ontario, Canada: \u0026quot;...to the Chippewas, the \u0027oat planters\u0026quot;, were known as \u0027moonooming\u0027. The white settlers took this to sound like \u0027Wyoming.\u0027\u0026quot;\u0026lt;ref\u0026gt;http://plympton-wyoming.com/Birth_of_Town_Crest.htm\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Capital: Cheyenne\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A town in Delaware\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A city in Illinois\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A city in Iowa\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A town in Massachusetts\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A city in Michigan\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A city in Minnesota\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A village in New York\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A city in Ohio\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A borough in Pennsylvania\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"A village in Rhode Island\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"Either of two towns in Wisconsin\", \"priority\":12}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }