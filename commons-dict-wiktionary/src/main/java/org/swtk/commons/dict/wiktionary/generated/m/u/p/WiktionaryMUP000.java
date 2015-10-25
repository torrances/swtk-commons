package org.swtk.commons.dict.wiktionary.generated.m.u.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMUP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("muppet", "{\"term\":\"muppet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{wikipedia}}Coined by :wikipedia:Jim Henson|Jim Henson as an alteration of \u0027puppet\u0027. Henson once claimed that the word was a {{blend|marionette|puppet|nocap\u003d1|lang\u003den}}, supposedly because a Muppet is operated partly like a glove puppet and partly like a marionette; he later recanted that explanation, as the similarity to marionettes is tenuous at best.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of puppet created by Jim Henson, the Jim Henson Company, or the Muppets Studio LLC, and popularized by \u0027w:Sesame Sesame Street\u0027 and \u0027w:The Muppet The Muppet Show\u0027, typically operated with one hand of the puppeteer inside the head and a rod or glove to move one arm of the puppet\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One of a group of established puppet characters acting as a sort of repertory company, which first appeared as a group on \u0027The Muppet Show\u0027 and features Kermit the Frog, Miss Piggy, Fozzie Bear, and The Great Gonzo\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One of a group of established puppet characters appearing on \u0027Sesame Street\u0027, including Big Bird, Bert, Ernie, and Cookie Monster\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }