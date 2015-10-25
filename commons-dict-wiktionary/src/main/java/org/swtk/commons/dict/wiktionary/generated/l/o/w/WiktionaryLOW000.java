package org.swtk.commons.dict.wiktionary.generated.l.o.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLOW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lowbie", "{\"term\":\"lowbie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|low|bie|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A low-level character in an MMORPG\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, Caleb Chew, \u0026quot;[http://books.google.com/books?id\u003dyeoDAAAAMBAJ\u0026amp;pg\u003dPA35 Warhammer Online: Age of Reckoning]\u0026quot;, \u0027GameAxis Unwired\u0027, November 2008\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Chickening offers a much deeper prospect in grief management — no more raiding \u0027\u0027lowbie\u0027\u0027 zones on a drunken Saturday morning just for kicks\", \"priority\":3}]}, \"synonyms\":{}}");

	add("lowboy", "{\"term\":\"lowboy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|low|boy|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A low chest of drawers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1969\u0027\u0027, Vladimir Nabokov, \u0027Ada or Ardor\u0027, Penguin 2011, p. 190\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Puffing rhythmically, Jones set one of his beautiful dragon-entwined flambeaux on the \u0027\u0027low-boy\u0027\u0027 with the gleaming drinks\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A type of semi-trailer with two drops in deck height: one right after the gooseneck and one right before the wheels\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1979\u0027\u0027, Cormac McCarthy, \u0027Suttree\u0027, Random House, p.155\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Before the grave was half filled a truck entered the cemetery gates towing a \u0027\u0027lowboy\u0027\u0027 with a tractor chained to the bed\", \"priority\":6}]}, \"synonyms\":{}}");

	add("lowdown", "{\"term\":\"lowdown\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|low|down|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The story or truth; the scoop or dirt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"All the reporters hoped to be the first to get the \u0027\u0027lowdown\u0027\u0027 on the celebrity\u0027s marriage plans\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lowercamelcase", "{\"term\":\"lowercamelcase\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"CamelCase that starts with an lower-case letter\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lowestoft", "{\"term\":\"lowestoft\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A town in Suffolk, England\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lowlife", "{\"term\":\"lowlife\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|low|life|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An untrustworthy, despicable, or disreputable person, especially one suspected of being a criminal\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"They say all the \u0027\u0027lowlifes\u0027\u0027 used to hang out at the docks and plot their despicable crimes, before being elected to public office\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lowlihead", "{\"term\":\"lowlihead\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) \u0027lowlyhede\u0027 equivalent to {{suffix|lowly|head|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being lowly; meekness; humility\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1888\u0027\u0027, Baron Alfred Tennyson Tennyson, \u0027Early poems\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The stately flower of female fortitude, Of perfect wifehood and pure \u0027\u0027lowlihead\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, Dante Alighieri, Dante Gabriel Rossetti, \u0027La Vita Nuova\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"But through a perfect gentleness, instead. For from the lamp of her meek \u0027\u0027lowlihead\u0027\u0027 Such an exceeding glory went up hence\", \"priority\":5}]}, \"synonyms\":{}}");

	add("lowlihood", "{\"term\":\"lowlihood\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|lowly|hood|lang\u003den}}. Compare {{l|en|lowlihead}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being lowly; meekness; humility\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lowrider", "{\"term\":\"lowrider\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|low|rider|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A car or truck which has had its suspension system modified so that it rides as low to the ground as possible\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }